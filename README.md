![This is my personal website](https://github.com/cgedler/cgedler/blob/main/linkedin.png)

👋 Hi!, I am a professional in the area of information technologies. I have been working for 18 years in the technology area, providing support in technological infrastructure and IT solutions, for 5 years I have dedicated myself to the development of Software to improve and optimize existing processes in (PYMES-Institutions-Corporations), developing web systems and desktop applications for easy, effective and profitable use, also integrating new functionalities and requirements that do not exist in other management software (Profit Plus System 2KDoce and 2k8).

I have experience and professional knowledge in:
- Java
- Spring Framework
- C
- C#
- .Net Framework
- Python
- Django
- among other knowledge.

And Databases:
- PosgreSQL
- MySql
- MS-SQL Server 	![MicrosoftSQLServer](https://img.shields.io/badge/Microsoft%20SQL%20Server-CC2927?style=for-the-badge&logo=microsoft%20sql%20server&logoColor=white)

📫 cgedler@gmail.com

### **AboutMe.java**
```
package ve.com.cge.presentation;

import java.util.ArrayList;
import java.util.List;

/**
 * A few things about me...
 * 
 * @author Christopher Gedler <cgedler@gmail.com>
 * @version 1.0
 */
public class AboutMe {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("********************* START **************************");
        System.out.println("             All roads lead to Rome.....              ");
        
        ArrayList<ProgrammingLanguage> myList = new ArrayList<ProgrammingLanguage>();
        
        String[] languages = new String[7];
        languages[0] = "C";
        languages[1] = "C#";
        languages[2] = "Java";
        languages[3] = "JavaScript";
        languages[4] = "Python";
        languages[5] = "Vb.Net";
        languages[6] = "Other old ones that I remember like: Clipper, Pascal, vb, Vfp";
        
        for (int i = 0; i < languages.length; i++) {
            ProgrammingLanguage tempProgrammingLanguage = new ProgrammingLanguage(i, languages[i]);
            myList.add(tempProgrammingLanguage);    
        }
        
        // Ok now yes!!!
        // a me
        Person me = new Person(12345678, "Christopher Gedler", myList);
        System.out.println("My Person data :");
        System.out.println('\t' + "- My id: " + me.getId());
        System.out.println('\t' + "- My name: " + me.getName());
        System.out.println('\t' + "- Languages I know : ");
        for (int i = 0; i < me.getLanguages().size(); i++){ //Bucle for mejorado
            System.out.println('\t' + "- " + (i+1) + " " + me.getLanguages().get(i));    
        } 
        System.out.println("");
        System.out.println("               Thanks for watching                  ");
        System.out.println("********************* END **************************");   
    }
    
}
```


