import java.util.Scanner;
public class AutoSort {


	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("����������Ԫ�ص�����__ (��С��2��������100)");
		int length = myScanner.nextInt(); 

		int[] array = new int[length]; 

		if(length>=2 && length<=100){

			for(int i = 0; i < array.length; i++){

				System.out.println("�������"+(i+1)+"��Ԫ�ص�ֵ");
				array[i]= myScanner.nextInt();
			}
		}else{
			System.out.println("��������ȷ��ֵ");
			return; 
		
		}
		int temp = 0; 
		
		for(int i = 0; i < array.length-1 ; i++){ 

			for(int j = 0; j < array.length-1 ; j++) {

			if(array[j] > array[j+1]) {

				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}

		}

		}
		System.out.println("----------����������Ϊ----------");
		for(int a =0 ; a < array.length; a++){
			System.out.print(array[a]+" ");
		}

	}
}