//104403012 ���3A �d�ۧ�
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.*;


public class PrimeFactor {
	private static Iterator<Integer> it;
	private static TreeSet<Integer> ts;
	private static int count;      //�ΨӧP�_�]�ƬO�_�����
	private static int factorcount;//���]�ƭӼ�
	
	
	public static void main(String[] args) {
		while(true) {
			try {
				String s = JOptionPane.showInputDialog("��J�@�Ӿ��");
				if(s==null) {System.exit(0);}//�P�_�������}
				Integer.parseInt(s);
				int n = Integer.parseInt(s);
				Set<Integer> factor = new HashSet<Integer>();
				count = 0;
				factorcount = 0;
				int originalnum = n;
				if(n>0) {           //�P�_�O�_������
				   for(int i=2;i<n;i++){ //��]�ƺ�k
						if(n%i==0){
							for(int j=2;j<=i;j++){
								if(i%j==0){             //�P�_�]�ƬO�_���Ȧ]�Ʀ�
									count++;
									if(count>1){
										break;
									}
								}
						
							}			
							if(count==1){						
							    factorcount++;
								factor.add(i);					
							}
						}
						count = 0;										
				  }
					if(factorcount==0) {
						JOptionPane.showMessageDialog(null, originalnum+"�O�ȼ�");
					}
					else {
						ts = new TreeSet<Integer>(factor);
				      	it = ts.iterator();
						if(it.hasNext())
						{
							for(int q=1;q<=factorcount;q++) {
							JOptionPane.showMessageDialog(null,originalnum+"����]�ƥ]�t: "+(int)it.next(),"��]��"+q+"/"+factorcount,JOptionPane.PLAIN_MESSAGE);
							}
						}	
				    }					
				}
				else {
					JOptionPane.showMessageDialog(null,"��J����Ʀn�v");
				}
			}
			catch (NumberFormatException e){  //�P�_�O�_�����
				JOptionPane.showMessageDialog(null,"��J����Ʀn�v");
			}
		}
	}
}
