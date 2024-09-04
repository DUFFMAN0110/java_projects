 

import java.util.Scanner;
import java.io.File; 
import java.io.IOException;
import static java.lang.System.*; 

public class CipherRunner{

    public static void main(String[] args)throws IOException{
        // Scanner file = new Scanner(new File("wordsCaesar.dat"));
        // file.nextInt(); 
        // file.nextLine(); 
        // CaesarCipher cc = new CaesarCipher(file.nextLine()); 
        // out.print(cc);
        // while(file.hasNextLine()){
        //     cc.setWord(file.nextLine()); 
        //     out.print(cc);
        // }
        
        // (Caesar Cipher) Typing what wants to be encoded in the System
        //   try (Scanner kb = new Scanner(in)) {
        //     out.print("Enter a line to encode :: "); 
        //       String str = kb.nextLine(); 
        //       CaesarCipher cs = new CaesarCipher(str);
        //       out.println(cs);
        // } 

        // ****(Vigenere Cipher) Scanning a file of words to encode & their keys****
        Scanner sc = new Scanner(new File("C:\\Users\\josep\\OneDrive\\repos\\java_projects\\Ciphers\\wordsVigenere.dat")); 
        sc.nextInt(); 
        sc.nextLine(); 
        VigenereCipher vc = new VigenereCipher(sc.next(),sc.next()); 
        out.print(vc); 
        
        while(sc.hasNextLine()){
            vc.setWord(sc.next()); 
            vc.setKey(sc.next()); 
            sc.nextLine(); 
            out.print(vc); 
        }

        sc.close(); 
        // Scanner l = new Scanner(in);
        // out.print("Enter a line to encode :: ");
        // String kl = l.nextLine(); 
        // out.print("Enter a key :: "); 
        // String k = l.nextLine();  
        // VigenereCipher v = new VigenereCipher(kl,k);  
        // out.println(v); 

    }
}

    

/*
    sample data for CaesarCipher ::
 *  7
    Joseph
    Camryn
    Lila
    abcdef
    zxyw
    computer
    science


    Output::
    Joseph
    glpbme

    Camryn
    zxjovk

    Lila 
    ifix

    abcdef
    xyzabc

    zxyw
    wuvt

    computer
    zljmrqbo

    science
    pzfbkzb
    


    sample data for Vigenere Cipher
    8 
    Joseph hello
    Lila wh
    Camryn zklm
    Howdy picture
    supercalifragilisticexpialodocious bob
    porque why
    monotonous always
    keywords key 


    Example output::
    Joseph hello
    Encoded :: Qsdpdo
    Decoded :: Joseph

    Lila wh
    Encoded :: Hphh
    Decoded :: Lila

    Camryn zklm
    Encoded :: bkxdxx
    Decoded :: Camryn

    Howdy picture
    Encoded :: Wwyws
    Decoded :: Howdy
    
    supercalifragilisticexpialodocious bob
    Encoded :: 
    Decoded :: supercalifragilisticexpialodocious

    porque why
    Encoded ::
    Decoded :: porque

    monotonous always
    Encoded :: 
    Decoded :: monotonous

    keywords key
    Encoded ::
    Decoded :: keywords

 */