public class YHTriangle {

	public static void main(String[] args) {
		
		//���һ���ܴ�ӡ��������ǵĳ���
		int end = 10;//�趨����
		int[][] array = new int[end][ ];//����һ����̬��ά����

		for(int i = 0; i < array.length; i++){

			array[i]=new int[i+1];//ÿ��������==����

			for(int j  = 0; j < array[i].length; j++){
				if(j==0 || j==i){
					array[i][j]=1;//ÿ��ĵ�1���������һ������Ϊ1
					System.out.print(array[i][j]+"\t");
				}else{
					array[i][j] = array[i-1][j] + array[i-1][j-1];
				//��������ֵΪ��һ��ͬһ�е���(i-1,j)����һ����һ�е���(i-1,j-1)�ĺ�
					System.out.print(array[i][j]+"\t");
				}
			}
			System.out.print("\n");
		}
	}
}