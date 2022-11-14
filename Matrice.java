import java.util.ArrayList;
import java.util.List;

public class Matrice {
	private int lignes;
	private int [][] matrice; 
	private int colones;
	//private int N;
	
public Matrice(int lignes,int colones, int[][] matrice) {  //Contructeur d'objet avec les 3 variables 
	this.lignes= lignes; 
	this.colones=colones;
	this.matrice=matrice;
	matrice = new int[lignes][colones];

	 
	}



public Matrice( int[][] matrice) {		//Constructeur d'objet avec le tableau a deux dimension seulment  
	
	this.matrice=matrice;
	this.lignes=matrice.length;
	this.colones=matrice[0].length;
	matrice = new int[lignes][colones];


	
}
public Matrice(int lignes,int colones) {	//Constructeur d'objet avec la variable colonnes et lignes seulment 
	this.colones=colones;
	this.lignes=lignes;
	matrice = new int[lignes][colones];

}
	
public void afficheMat() {					//Methode pour afficher la matrice 
	for(int i=0;i<this.lignes;i++) {
		for(int j=0;j<this.colones;j++) {
			System.out.print(matrice[i][j]+"\t");}
				System.out.print("\n");
}
}






public List diagonaleVect() {		//Methode pour r�cuperer la diagonale de la matrice et la sauvgarder dans une liste 
	List r�sultat = new ArrayList();
	for(int i=0;i<lignes;i++) {
		r�sultat.add(this.matrice[i][i]);
		
}
	return r�sultat ; 
}




	public Matrice diagonaleMat() {			//Methode pour r�cuperer la diagonale de la matrice et la sauvgarder dans une Matrice 
	int[][] r�sultat = new int [lignes][colones];

	Matrice mat = new Matrice(r�sultat);

	for(int i=0,j=0;i<lignes;i++,j++) {

			
		
			r�sultat[i][j]=this.matrice[i][j];

}
	return mat ; 
}



public List InfVect() {				//Methode pour r�cuperer la partie inf�rieur de la matrice et la sauvgarder dans une liste 
	
	List r�sultat = new ArrayList();
	for(int i=1;i<lignes;i++) {
		
		for(int j=0;j<i;j++) {
			
		
		
		
		r�sultat.add(this.matrice[i][j]);
		
}
}
	return r�sultat ; 



}
public Matrice InfMat() {			//Methode pour r�cuperer la partie inf�rieure de la matrice et la sauvgarder dans une Matrice 

	int[][] r�sultat = new int [lignes][colones];

	Matrice mat = new Matrice(r�sultat);

	for(int i=1;i<lignes;i++) {
		for(int j=0;j<i;j++) {
			
		
			r�sultat[i][j]=this.matrice[i][j];

		
		}
}
	return mat ; 



}
public List SupVect() {	//Methode pour r�cuperer la partie sup�rieure  de la matrice et la sauvgarder dans une Liste
	List r�sultat = new ArrayList();
	for(int i=0;i<lignes-1;i++) {
		
		for(int j=i+1;j<colones;j++) {
			
	

		r�sultat.add(this.matrice[i][j]);
		
}
}
	return r�sultat ; 



}

public Matrice SupMat() {			//Methode pour r�cuperer la partie sup�rieure  de la matrice et la sauvgarder dans une Matrice

	int[][] r�sultat = new int [lignes][colones];
	Matrice mat = new Matrice(r�sultat);
	
	for(int i=0;i<lignes-1;i++) {
		for(int j=i+1;j<colones;j++) {
			
		
		r�sultat[i][j]=this.matrice[i][j];

		
}
}
	return mat ; 



}

public void affichesup() {			//Affichage la partie que sup�rieure de la matrice.

	for(int i=0;i<lignes-1;i++) {	
		for(int j=i+1;j<colones;j++) {
			
		 
		

		
		System.out.print(this.matrice[i][j]+"\t");
}
	System.out.println();	
	for(int k=0;k<i+1;k++) {
		System.out.print("\t");

	}

	
}



}
public void afficheinf() { 	//afficher la partie inf�rieure de la matrice 
	for(int i=1;i<lignes;i++) {	
		for(int j=0;j<i;j++) {
			

		
	
		
		System.out.print(this.matrice[i][j]+"\t");

}
		System.out.println();
}




}



public void afficheDiag() { 	//afficher la partie Diagonale de la matrice 
	
	
	
	for(int i=0,j=0;i<lignes;i++,j++) {	
		
		System.out.println(this.matrice[i][j]);
		for(int k=(lignes-i)-1;k<lignes;k++) {	
			System.out.print("\t");
	}
}

}












public Matrice MatriceDiag() {		//Mettre la partie diagonale dans une matrice a 3 colones I, J et Val	
		Matrice r�sultat = new Matrice(lignes,3);
		int k =0;

		for(int i=0,j=0;i<this.lignes;i++,j++) {
			
			 
			r�sultat.matrice[k][0]=i;
			r�sultat.matrice[k][1]=j;
			r�sultat.matrice[k][2]=this.matrice[i][j];
			k++;
		
	}
		return r�sultat ; 
	}
public Matrice MatriceHaut() {				//Mettre la partie Sup�rieure dans une matrice a 3 colones I, J et Val	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	System.out.println(N);
	Matrice r�sultat = new Matrice(N,3);
	int k=0;
	for(int i=0;i<lignes-1;i++) {
		
		for(int j=i+1;j<colones;j++) {
			r�sultat.matrice[k][0]=i;
			r�sultat.matrice[k][1]=j;
			r�sultat.matrice[k][2]=this.matrice[i][j];
			k++;

		
}
	
}
	return r�sultat ; 



}



public Matrice MatriceBas() {	//Mettre la partie Inf�rieure dans une matrice a 3 colones I, J et Val	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice r�sultat = new Matrice(N,3);
	int k=0;
	
for(int i=1;i<lignes;i++) {
		
		for(int j=0;j<i;j++) {
			
		
		
			r�sultat.matrice[k][0]=i;
			r�sultat.matrice[k][1]=j;
			r�sultat.matrice[k][2]=this.matrice[i][j];
			k++;

		
}
	
}
	return r�sultat ; 



}

public Matrice LinInf() {		//Lin�ariser la partie Inf�rieure 
	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice r�sultat = new Matrice(N,2);
	int k=0;
	
for(int i=1;i<lignes;i++) {
		
		for(int j=0;j<i;j++) {
			
		
			int L=(i*this.colones)+j;
			r�sultat.matrice[k][0]=L;
			r�sultat.matrice[k][1]=this.matrice[i][j];
			k++;

		
}
	
}
	return r�sultat ; 


}




public Matrice LinSup() {		//Lin�ariser la partie Sup�rieure 
	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice r�sultat = new Matrice(N,2);
	int k=0;
	
for(int i=0;i<lignes-1;i++) {
		
		for(int j=i+1;j<colones;j++) {
			
		
			int L=(i*this.colones)+j;
			r�sultat.matrice[k][0]=L;
			r�sultat.matrice[k][1]=this.matrice[i][j];
			k++;

		
}
	
}
	return r�sultat ; 


}

public Matrice LinDiag() {		//Lin�ariser la partie Diagonale
	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice r�sultat = new Matrice(this.lignes,2);
	int k=0;
	
	for(int i=0,j=0;i<lignes;i++,j++) {

		
		
			
			r�sultat.matrice[k][0]=(i*this.colones)+j;
			r�sultat.matrice[k][1]=this.matrice[i][j];
			k++;

		

	
}
	return r�sultat ; 


}



public Matrice Delin(Matrice Haut,Matrice Bas,Matrice Diag) {	////D�lin�ariser les 3 parties Lin�aris�s Inf�rieure, Sup�rieure et Diagonale en la mettant dans une Matrice dense.  
	int N=(int) (((Math.pow(Diag.lignes, 2))-Diag.lignes)/2);
	
	if(Haut.lignes==Bas.lignes && N==Haut.lignes) {
			 
			Matrice mat = new Matrice(Diag.lignes,Diag.lignes);
			
						
			
			
			
			for(int i=0;i<Haut.lignes;i++) {
					
						
											int ligne=(int)((Haut.matrice[i][0])/5);
											int colone=((Haut.matrice[i][0])%5);
											mat.matrice[ligne][colone]=Haut.matrice[i][1];
						

											
											int ligne1=(int)((Bas.matrice[i][0])/Diag.lignes);
											int colone1=((Bas.matrice[i][0])%Diag.lignes);
											mat.matrice[ligne1][colone1]=Bas.matrice[i][1];
											
											if(i<Diag.lignes) {
											int ligne2=(int)((Diag.matrice[i][0])/Diag.lignes);
											int colone2=((Diag.matrice[i][0])%Diag.lignes);
											mat.matrice[ligne2][colone2]=Diag.matrice[i][1];
											}


						

		
						}
	

								return mat;
		}
	System.out.println("veuillez entrez les matrices lin�aris� dans le sens Matrice SUP,INF,Diagonale et le meme nombre de lignes pour la matrice sup et inf");

	return null;
	
}




public Matrice Assembler(Matrice Haut,Matrice Bas,Matrice Diag) {	//Assembler 3 Matrices non lin�aris�s Haut, Bas et Diagonale pour former la matrice dense  
	
	if(Haut.lignes==Bas.lignes && Haut.lignes==Diag.lignes) {
			 
			Matrice mat = new Matrice(Diag.lignes,Diag.lignes);
			
						
			
			
			
			for(int i=0,j=0;i<lignes;i++,j++) {
					mat.matrice[i][j]=Diag.matrice[i][j];
						
			}

			for(int i=0;i<Haut.lignes-1;i++) {
				for(int j=i+1;j<Haut.colones;j++) {
					mat.matrice[i][j]=Haut.matrice[i][j];
				}
			}
											
			for(int i=1;i<Bas.lignes;i++) {
				for(int j=0;j<i;j++) {					
						
					mat.matrice[i][j]=Bas.matrice[i][j];

		
						}
	

		}
			return mat;

	
}	System.out.println("veuillez entrez les matrices dans le sens suivant Matrice SUP,INF,Diagonale et le meme nombre de lignes pour la matrice sup et inf");

	return null;



}




//--------------------------------------------------------------NOUVELLES FONCTIONS--------------------------------------------------------------------------------------

public Matrice Dense() { 
	int k = 0 ;
	for(int i=0;i<this.lignes;i++) {
		for(int j=0;j<this.colones;j++) {
			if(this.matrice[i][j]!=0) {
				k++;
			}
		}

	}
	Matrice resultat = new Matrice(k,3);
	int j=0;
	for(int x=0;x<this.lignes;x++) {
		for(int y=0;y<this.colones;y++) {

			if(this.matrice[x][y]!=0) {

				resultat.matrice[j][0]=x; 
				resultat.matrice[j][1]=y;
				resultat.matrice[j][2]=this.matrice[x][y];

				j++;

			}
 
 

		}

	}
return resultat;
}



public Matrice Lin() { 
	int k = 0 ;
	for(int i=0;i<this.lignes;i++) {
		for(int j=0;j<this.colones;j++) {
			if(this.matrice[i][j]!=0) {
				k++;
			}
		}

	}
	Matrice resultat = new Matrice(k,2);
	int j=0;
	for(int x=0;x<this.lignes;x++) {
		for(int y=0;y<this.colones;y++) {

			if(this.matrice[x][y]!=0) {
	 
				resultat.matrice[j][0]=(x*this.colones)+y;
				resultat.matrice[j][1]=this.matrice[x][y];
				j++;

			}
 
 

		}

	}
return resultat;
}

public Matrice Delin(int taille_creuse) {//delin�arisation de la matrice dense en donnant la taille de la matrice creuse carr� 
	
	Matrice resultat = new Matrice(this.lignes,3);
	for(int i=0 ;i<this.lignes;i++) {
	
		
		int ligne=(int)((this.matrice[i][0])/taille_creuse);
		int colone=((this.matrice[i][0])%taille_creuse);
		
		resultat.matrice[i][0]=ligne;
		resultat.matrice[i][1]=colone;
		resultat.matrice[i][2]=this.matrice[i][1];	
	
	}
	
	
	
	return resultat;
}


public Matrice transpos�eCreuse (){// transpos� de la matrice creuse
	Matrice r�sultat = new Matrice(this.lignes,this.colones);
	
		for(int i=0;i<this.lignes;i++) {
			for(int j=0;j<this.colones;j++) {

			
				if (this.matrice[i][j]!=this.matrice[j][i]) {
				
			
					r�sultat.matrice[i][j]=this.matrice[j][i];
		

		
				}
			}
	
		}

	return r�sultat ;
}







public Matrice transpos�eDense (){// transpos� de la matrice Dense 
	Matrice r�sultat = new Matrice(this.lignes,3);
	
		for(int i=0;i<this.lignes;i++) {
			
			
			if (this.matrice[i][0]!=this.matrice[i][1]) {
				
			
		r�sultat.matrice[i][0]=this.matrice[i][1];
		r�sultat.matrice[i][1]=this.matrice[i][0];
		r�sultat.matrice[i][2]=this.matrice[i][2];

		
			}
	
}

	return r�sultat ;
}





}
