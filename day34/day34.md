# 34일차

## [1] 복습 (Select)

>Product 테이블

[DAO](./src/multi/ProductDAO.java), [VO](./src/multi/ProductVO.java)<br>
[메인 페이지](./WebContent/product.html), 검색 : [HTML](./WebContent/select3.html), [JSP](./WebContent/select3.jsp), 전체 리스트 조회 : [JSP](./WebContent/selectAll3.jsp)

- 케이크 가게로 가정하고 HTML을 다시 꾸미고, DB에 데이터를 넣어줌

1. `Select`

- Select 구문을 그동안 `= '?'`로 결과 값이 한개인 경우만 실습 했었는데 이번에는 `Like %?%`로 여러개가 나올 수 있을 때 (혹은 안나오거나 1개)로 바꿔봄

- 검색 결과가 있는 경우(배열 사이즈가 1개 이상) 테이블을 보여주며, 없는 경우(배열 사이즈 == 0) 테이블을 보여주지 않고, 검색 결과 없음이라고 띄움

- 시그니처 케이크(당근 케이크)이동 시에도 똑같은 구문(Like)을 씀. 데이터가 적고, 이름이 겹치지 않아 현재는 원하는 대로 보여주지만, 만약 나중에 특정 상품만 보이게 하려면 따로 SQL구문을 만들거나(= ?) 아예 상세페이지 주소를 가져와야 함

```jsp
<% if(selectResult.size() > 0){ %>
<table border="1">
	<tr>
		<td>케이크 </td>
		<td>케이크 이름 </td>
		<td>케이크 가격 </td>
		<td>케이크 설명</td>
	</tr>
	<% 
	for (ProductVO productVO : selectResult) {
	%>
	<tr>
		<td><p align="center"> <img src="img/<%= productVO.getImg() %>" height=300></p></td>
		<td><%= productVO.getName() %></td>
		<td><%= productVO.getPrice() %></td>
		<td><%= productVO.getContent() %></td>
	</tr>
	<% 
	}
}else{
%>
검색 결과 없음
<% } %>
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225796201-1cb2ae58-11ba-4ab7-9eb3-64b6df97b294.gif" width=800></p>

2. `Select All`

- 전체 상품 리스트 받아오기

DB>
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225811620-f2d80435-7553-47c2-b9d8-38cce8256d10.png" width=600></p>

조회 화면>
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225795196-b3e2f093-8598-4b99-89fd-75b548712174.gif" width=800></p>


## [2] JSP 조별 실습

음원 차트에서 음악 추가 / 삭제, 조회수가 많은 순으로 차트 보여주기

전체 코드 : [메인페이지](./WebContent/music.html), [DTO(VO)](./src/multi/MusicVO.java), [DAO](./src/multi/MusicDAO.java), [music_chart.jsp(차트)](./WebContent/music_chart.jsp), [music_listen.jsp(조회수)](./WebContent/music_listen.jsp)

1. 테이블 생성 (Music)

```SQL
-- multi.music definition

CREATE TABLE `music` (
  `song_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `artist` varchar(100) NOT NULL,
  `hit` int(11) NOT NULL,
  `img` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`song_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
```

song_id : 각 음원의 고유 id

title / artist / hit / img : 노래 제목 / 아티스트 / 조회수 / 앨범아트

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225841504-6fd6e37a-5d1e-4f7c-b2be-9f3625dc7643.png" width=500></p>

2. DTO(VO) 클래스 생성

[DTO(VO)](./src/multi/MusicVO.java)

- 테이블 컬럼으로 멤버 변수 지정

- getter/setter 메소드 정의


3. DAO 클래스 생성 및 메소드 정의

- CRUD 중 맡은 메소드는 Update로, 실질적으로 음원정보는 한번 음원이 등록되면 거의 바뀌지 않기 때문에, 클릭마다 조회수를 Update하는 것이 더 실질적인 기능이라 생각하였다.

- 따라서 음원 차트에서 음원 재생 시, 조회수가 올라가는 방식으로 구현하였다.

- Select(*) 메소드로 음악 리스트 전체를 받아온 다음 조회수 역순(조회수가 많은 순, ORDER BY HIT DESC)으로 정렬하였다.

- 각 노래마다 감상 버튼을 넣고, 버튼 클릭시 조회수가 1 올라가고(Update), '노래 제목 + 아티스트'를 유튜브에서 검색한 페이지로 연결된다.

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225845973-f33c2d1d-494f-4400-adbc-b08012cf4ad9.gif" width=900></p>

>전체 음원 리스트 받아오기


[DAO](./src/multi/MusicDAO.java), [music_chart.jsp(차트)](./WebContent/music_chart.jsp)

```java
//DAO 
public ArrayList<MusicVO> getChart() {
	ArrayList<MusicVO> chart = new ArrayList<>();
	ResultSet rs = null;
		
	try {
		String sql = "SELECT title, artist, img, hit, song_id FROM MUSIC order by hit DESC";
		PreparedStatement ps = con.prepareStatement(sql);
			
		rs = ps.executeQuery();
		
		while(rs.next()) {
			String title2 = rs.getString(1);
			String artist2 = rs.getString(2);
			String img2 = rs.getString(3);
			int hit2 = rs.getInt(4);
			int song_id2 = rs.getInt(5);
				
			MusicVO vo = new MusicVO();
				
			vo.setTitle(title2);
			vo.setArtist(artist2);
			vo.setImg(img2);
			vo.setHit(hit2);
			vo.setSong_id(song_id2);
				
			chart.add(vo);
		}
	} catch (Exception e) {
		System.out.println("오류 발생");
	}
	return chart;
}
```


>클릭 시 조회수 +1

[music_chart.jsp(차트)](./WebContent/music_chart.jsp), [music_listen.jsp(조회수)](./WebContent/music_listen.jsp)

- 기존 조회수에 +1이므로, 기존 조회수와 song_id를 인풋으로 넘긴다

- 동시에 유튜브로 노래 제목과 아티스트 이름이 검색된 페이지로 넘어간다.


```jsp
<!-- music_chart.jsp ; 차트 실행 부분 (Select)-->
<td>
	<a href= "http://localhost:8888/web01/music_listen.jsp?song_id=<%= chartList.get(i).getSong_id() %>&hit=<%= chartList.get(i).getHit() %>"
	onclick="window.open('https://www.youtube.com/results?search_query=<%= chartList.get(i).getTitle() %>+<%= chartList.get(i).getArtist() %>')" >
		<button>듣기</button>
	</a>
</td>
```

```jsp
<!-- music_listen.jsp ; 조회수 +1 (Update) -->
<%
    int song_id = Integer.parseInt(request.getParameter("song_id"));
    int hit = Integer.parseInt(request.getParameter("hit"));
    
    MusicDAO dao = new MusicDAO();
    dao.update(song_id, hit);
%>
```

```java
public void update(int song_id, int hit) {
	int result = 0;
	ResultSet rs = null;
	
	try {
		String sql = "update music set hit = ? where song_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, hit+1);	//조회수 +1
		ps.setInt(2, song_id);
		result = ps.executeUpdate();
		
	} catch (Exception e) {	//모든 예외 처리
		e.printStackTrace();
	}
}
```
