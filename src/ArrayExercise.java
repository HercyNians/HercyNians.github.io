public class ArrayExercise{
	public static void main(String[] args){
		int i=0 ;
		int[] num = {4,-1,9,10,23,15,17,15,22,3,54,97,66,103,542,1,9,6,7,88};
		int max = num[0];
		for( ; i < num.length ; i++){
			if(max <= num[i]){
				max = num[i];
			}
		}
		System.out.println(max);
	}
}
class ArrayExercise02{

	public static void main(String[] args) {
		//���һ���ܹ������鷴ת�ĳ���
		//ʹ������ֵ��
		int[] array = {11,22,33,44,55,66,77,88,99};//���������ʼ��
		int[] array2 = new int[array.length];//����һ���µ����ݿռ�

		for(int a=0; a<array.length; ++a){//�������ʼ�������������ݿռ�
			array2[a]=array[a];
		}
		for(int i=0; i<array.length; ++i){//�������ݿռ��ڽ������鷴ת
			array[i]=array2[array.length-(i+1)];
			System.out.println("array="+array[i]);//�����ת�������
		}
	}
}