
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nis
 */
public class Interaction {
    
      static Point A= new Point();
      static Point B= new Point(5);
      static Point C = new Point(3,8);
      static Segment ext1= new Segment(B);
      static Segment ext2= new Segment(B,C);
      static Cercle cercle1 = new Cercle(ext1);
       static Cercle cercle2 = new Cercle(B,ext2);
        static int choix = 0;
        
      static  Scanner clavier = new Scanner(System.in);
       public static void choice(){
       
       
       
        System.out.println("****Menu****");
        System.out.println("1-Afficher les coordonnées des points et leur symetrique");
         System.out.println("2-Afficher Un segment entre deux point So Symetrisue et la distance");
          System.out.println("3-Afficher Un cercle son perimetre ");
           System.out.println("4-Exit");
           do{
          System.out.println("Votre choix : ");
           choix= clavier.nextInt();
          
          
          switch(choix){
    case 1 :
        
       System.out.println("Le Point A mes coordonnées sont : A"+ A);
       System.out.println("Le Point B mes coordonnées sont : B"+ B);
       System.out.println("Le Point B mes coordonnées sont : C"+ C);
       System.out.println();
       System.out.println("L'image de  A est: A'"+ A.symetrie());
       System.out.println("L'image de  B est: B'"+ B.symetrie());
       System.out.println("L'image de  C est :C'"+ C.symetrie());
       System.out.println();
    break;
    
    case 2 :
       
       
              System.out.println("Le Segement AB "+ ext1+ " = " +ext1.distance());
              System.out.println("L'image de  AB est: AB'"+ ext1.symetrie());
       
              System.out.println("Le Segement BC "+ ext2+ " = " +ext2.distance());
              System.out.println("L'image de  BC est: BC'"+ ext2.symetrie());
              System.out.println();
    
    break;
    case 3 :
              
        System.out.println("Le perimetre du  cercle C1 de "+ cercle1+ " = " + cercle1.perimetre());
        System.out.println("Le perimetre du  cercle C2 de "+ cercle2+ " = " + cercle2.perimetre());
    break;
    case 4:
         System.out.println("Au Revoir et Merci ! ");
        break;
    default: 
     System.out.println("Choix invalide");
        break;
}
          
        

       
     
       
    }
           while(choix != 4);
           
 
    
    
}
    
    
    
    
    
    
    
    
    
   
     
    
}
