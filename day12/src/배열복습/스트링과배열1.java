package �迭����;

public class ��Ʈ�����迭1 {

	public static void main(String[] args) {
		String s = "���� ���α׷�������";
		String s2 = "��¥!!";
		
		//String ��ġ��
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		
		//String ���� ����
		System.out.println(s.charAt(0));
		char c = s.charAt(0);
		
		System.out.println(s.endsWith("��"));
		boolean result = s.endsWith("��");
		
		//String ���ڿ� ����
		String result2 = s.substring(3); //�ε��� 3���� ���ڿ� ��ü
		String result3 = s.substring(3, 8);
		System.out.println(result2);
		System.out.println(result3);
		
		boolean result4 = s.contains(s2);
		int index = s.lastIndexOf("��"); //������ "��"��ġ ����
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		s.replace("��", "��");	//���ı��Լ�
		System.out.println(s);
	}

}
