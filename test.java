import java.util.List;

public class test {
	
		
	
		public static void main(String[] args) {
			int [][] mat = {{0,1,2,3,4},{1,1,5,6,7},{2,3,2,8,9},{4,5,6,3,10},{7,8,9,10,4}};
			Matrice m =new Matrice(mat);
			m.afficheMat();
			//System.out.println();
			//m.afficheinf();
			//System.out.println();
			//m.affichesup();
			//System.out.println();
			//m.afficheDiag();
			
			System.out.println();
			//m.SupMat().afficheMat();
			//System.out.println();
			//m.InfMat().afficheMat();
			//System.out.println();
			//m.diagonaleMat().afficheMat();
			System.out.println();
			//m.MatriceHaut().afficheMat();
			System.out.println();
			//m.MatriceBas().afficheMat();
			//System.out.println();
			//m.MatriceDiag().afficheMat();
			System.out.println();
			
			m.LinSup().afficheMat();
			System.out.println();
			//m.LinDiag().afficheMat();
			System.out.println();
			//m.LinInf().afficheMat();
			//System.out.println();
			//m.Delin(m.LinSup(), m.LinInf(),m.LinDiag()).afficheMat();
			System.out.println();
			//m.Assembler(m.SupMat(), m.InfMat(), m.diagonaleMat()).afficheMat();
			System.out.println();
			
			m.Dense().afficheMat();
			System.out.println();
			m.SupMat().afficheMat();
			System.out.println();
			m.SupMat().transposéeCreuse().afficheMat();
			System.out.println();
			m.afficheMat();
			System.out.println();
			m.Lin().afficheMat();
			System.out.println();
			m.Lin().Delin(5).afficheMat();
			System.out.println();
			//m.transposée().Matrice3().afficheMat();
			
			
	
		
		

}}
