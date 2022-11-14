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






public List diagonaleVect() {		//Methode pour récuperer la diagonale de la matrice et la sauvgarder dans une liste 
	List résultat = new ArrayList();
	for(int i=0;i<lignes;i++) {
		résultat.add(this.matrice[i][i]);
		
}
	return résultat ; 
}




	public Matrice diagonaleMat() {			//Methode pour récuperer la diagonale de la matrice et la sauvgarder dans une Matrice 
	int[][] résultat = new int [lignes][colones];

	Matrice mat = new Matrice(résultat);

	for(int i=0,j=0;i<lignes;i++,j++) {

			
		
			résultat[i][j]=this.matrice[i][j];

}
	return mat ; 
}



public List InfVect() {				//Methode pour récuperer la partie inférieur de la matrice et la sauvgarder dans une liste 
	
	List résultat = new ArrayList();
	for(int i=1;i<lignes;i++) {
		
		for(int j=0;j<i;j++) {
			
		
		
		
		résultat.add(this.matrice[i][j]);
		
}
}
	return résultat ; 



}
public Matrice InfMat() {			//Methode pour récuperer la partie inférieure de la matrice et la sauvgarder dans une Matrice 

	int[][] résultat = new int [lignes][colones];

	Matrice mat = new Matrice(résultat);

	for(int i=1;i<lignes;i++) {
		for(int j=0;j<i;j++) {
			
		
			résultat[i][j]=this.matrice[i][j];

		
		}
}
	return mat ; 



}
public List SupVect() {	//Methode pour récuperer la partie supérieure  de la matrice et la sauvgarder dans une Liste
	List résultat = new ArrayList();
	for(int i=0;i<lignes-1;i++) {
		
		for(int j=i+1;j<colones;j++) {
			
	

		résultat.add(this.matrice[i][j]);
		
}
}
	return résultat ; 



}

public Matrice SupMat() {			//Methode pour récuperer la partie supérieure  de la matrice et la sauvgarder dans une Matrice

	int[][] résultat = new int [lignes][colones];
	Matrice mat = new Matrice(résultat);
	
	for(int i=0;i<lignes-1;i++) {
		for(int j=i+1;j<colones;j++) {
			
		
		résultat[i][j]=this.matrice[i][j];

		
}
}
	return mat ; 



}

public void affichesup() {			//Affichage la partie que supérieure de la matrice.

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
public void afficheinf() { 	//afficher la partie inférieure de la matrice 
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
		Matrice résultat = new Matrice(lignes,3);
		int k =0;

		for(int i=0,j=0;i<this.lignes;i++,j++) {
			
			 
			résultat.matrice[k][0]=i;
			résultat.matrice[k][1]=j;
			résultat.matrice[k][2]=this.matrice[i][j];
			k++;
		
	}
		return résultat ; 
	}
public Matrice MatriceHaut() {				//Mettre la partie Supérieure dans une matrice a 3 colones I, J et Val	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	System.out.println(N);
	Matrice résultat = new Matrice(N,3);
	int k=0;
	for(int i=0;i<lignes-1;i++) {
		
		for(int j=i+1;j<colones;j++) {
			résultat.matrice[k][0]=i;
			résultat.matrice[k][1]=j;
			résultat.matrice[k][2]=this.matrice[i][j];
			k++;

		
}
	
}
	return résultat ; 



}



public Matrice MatriceBas() {	//Mettre la partie Inférieure dans une matrice a 3 colones I, J et Val	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice résultat = new Matrice(N,3);
	int k=0;
	
for(int i=1;i<lignes;i++) {
		
		for(int j=0;j<i;j++) {
			
		
		
			résultat.matrice[k][0]=i;
			résultat.matrice[k][1]=j;
			résultat.matrice[k][2]=this.matrice[i][j];
			k++;

		
}
	
}
	return résultat ; 



}

public Matrice LinInf() {		//Linéariser la partie Inférieure 
	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice résultat = new Matrice(N,2);
	int k=0;
	
for(int i=1;i<lignes;i++) {
		
		for(int j=0;j<i;j++) {
			
		
			int L=(i*this.colones)+j;
			résultat.matrice[k][0]=L;
			résultat.matrice[k][1]=this.matrice[i][j];
			k++;

		
}
	
}
	return résultat ; 


}




public Matrice LinSup() {		//Linéariser la partie Supérieure 
	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice résultat = new Matrice(N,2);
	int k=0;
	
for(int i=0;i<lignes-1;i++) {
		
		for(int j=i+1;j<colones;j++) {
			
		
			int L=(i*this.colones)+j;
			résultat.matrice[k][0]=L;
			résultat.matrice[k][1]=this.matrice[i][j];
			k++;

		
}
	
}
	return résultat ; 


}

public Matrice LinDiag() {		//Linéariser la partie Diagonale
	
	int N=(int) (((Math.pow(this.lignes, 2))-this.lignes)/2);
	Matrice résultat = new Matrice(this.lignes,2);
	int k=0;
	
	for(int i=0,j=0;i<lignes;i++,j++) {

		
		
			
			résultat.matrice[k][0]=(i*this.colones)+j;
			résultat.matrice[k][1]=this.matrice[i][j];
			k++;

		

	
}
	return résultat ; 


}



public Matrice Delin(Matrice Haut,Matrice Bas,Matrice Diag) {	////Délinéariser les 3 parties Linéarisés Inférieure, Supérieure et Diagonale en la mettant dans une Matrice dense.  
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
	System.out.println("veuillez entrez les matrices linéarisé dans le sens Matrice SUP,INF,Diagonale et le meme nombre de lignes pour la matrice sup et inf");

	return null;
	
}




public Matrice Assembler(Matrice Haut,Matrice Bas,Matrice Diag) {	//Assembler 3 Matrices non linéarisés Haut, Bas et Diagonale pour former la matrice dense  
	
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

public Matrice Delin(int taille_creuse) {//delinéarisation de la matrice dense en donnant la taille de la matrice creuse carré 
	
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


public Matrice transposéeCreuse (){// transposé de la matrice creuse
	Matrice résultat = new Matrice(this.lignes,this.colones);
	
		for(int i=0;i<this.lignes;i++) {
			for(int j=0;j<this.colones;j++) {

			
				if (this.matrice[i][j]!=this.matrice[j][i]) {
				
			
					résultat.matrice[i][j]=this.matrice[j][i];
		

		
				}
			}
	
		}

	return résultat ;
}







public Matrice transposéeDense (){// transposé de la matrice Dense 
	Matrice résultat = new Matrice(this.lignes,3);
	
		for(int i=0;i<this.lignes;i++) {
			
			
			if (this.matrice[i][0]!=this.matrice[i][1]) {
				
			
		résultat.matrice[i][0]=this.matrice[i][1];
		résultat.matrice[i][1]=this.matrice[i][0];
		résultat.matrice[i][2]=this.matrice[i][2];

		
			}
	
}

	return résultat ;
}





}
