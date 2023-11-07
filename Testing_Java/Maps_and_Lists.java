package Testing_Java;



import java.util.*;
import static java.lang.System.*; 



public class Maps_and_Lists{

    public static void main(String[] args){

        Set<Integer> hash = new HashSet<Integer>(); 
        hash.add(5);
        hash.add(7);
        hash.add(5);
        hash.add(9);
        hash.add(-8); 

        Set<Integer> tree = new TreeSet<Integer>(); 
        tree.add(5);
        tree.add(7);
        tree.add(5);
        tree.add(9);
        tree.add(-8); 


        Set<Integer> linkedHash = new LinkedHashSet<Integer>(); 
        linkedHash.add(12);
        linkedHash.add(3);
        linkedHash.add(16);
        linkedHash.add(8);
        linkedHash.add(10);
        linkedHash.add(6);
        
        Set<String> strhash = new HashSet<String>(); 
        strhash.add("abdcefghijklmnop");
        strhash.add("ba");
        strhash.add("abcdefghijklmnop");
        strhash.add("B");
        strhash.add("21");
        strhash.add("12");
        strhash.add("123");
        strhash.add("0");
        
        Set<String> strlink = new LinkedHashSet<String>();
        strlink.add("A");
        strlink.add("b");
        strlink.add("a"); 
        strlink.add("B");
        strlink.add("0");
        strlink.add("12");
        strlink.add("1");
        
        Set<String> strTree = new TreeSet<String>();
        strTree.add("a");
        strTree.add("b");
        strTree.add("A");
        strTree.add("b");
        strTree.add("0");
        strTree.add("12");
        strTree.add("1");

        out.println("\n\nHash Set involving Integers::\n\t"+hash); 
        out.println("\nTree Set involving Integers::\n\t"+tree + "\n\nLinked Hash Set involving Integers::\n\t" + linkedHash); 
        out.println("\nHash Set involving Strings::\n\t" + strhash);
        out.println("\nLinked Hash Set involving Strings::\n\t" + strlink + "\n\nTree Set involving Integers::\n\t" + strTree);


        ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
        arrlist.add(1); 
        arrlist.add(10); 
        arrlist.add(20); 
        arrlist.add(30); 
        arrlist.add(11); 
        arrlist.add(12); 
        arrlist.add(13); 
        arrlist.add(21); 
        arrlist.add(22); 
        arrlist.add(23); 
        arrlist.add(31); 
        arrlist.add(32); 
        arrlist.get(0); 
        arrlist.set(1,5);
        arrlist.subList(1,4); 

        out.println("\n_______________________________________________\n\nThis is an ArrayList::\n\t"+arrlist+ "\n\nThis is a part of that list (subList)::\n\t");
        out.println(arrlist.subList(1,4) ); 
        out.println("\n\n\n");
        
        Map hashMap = new HashMap(); 
        hashMap.put("tim",5); 
        hashMap.put("jon","s"); 
        hashMap.put(11,999); 


        out.println("This prints the element at the key 'tim' ::\n\t"+hashMap.get("tim"));
        out.println("\n\nThis prints the keys and their corresponding elements (prints the Hash Map)::\n\t"+hashMap); 
        out.println("\n");

        Map treeMap = new TreeMap();
        treeMap.put("Joseph","First Name");
        treeMap.put("Duff","Last Name");

        out.println("This prints the keys and their corresponding elements (prints the Tree Map)::\n\t"+treeMap); 
        out.println("\n");

        Map linkedMap = new LinkedHashMap(); 
        linkedMap.put("help",911); 
        linkedMap.put(5,20);
        linkedMap.put("Call Me", 911); 

        out.println("This prints the keys and their corresponding elements (prints the Linked Hash Map)::\n\t"+linkedMap); 
        out.println("\n"); 

        out.println("This prints true if the map contains the element '20', or false if it doesn't::\n\t"+linkedMap.containsValue(20));
        out.println("\nThis prints true if the map contains the key 'tim', or false if it doesn't::\n\t"+hashMap.containsKey("tim")); 

        Map testMap = new HashMap(); 
        String str = "Hello my name is Joseph and I am dumb";

        out.println("\n"+str+"\n\nthis Map loop makes each letter a key and the amount of times it appears becomes the element ");

        for(char x:str.toCharArray()){
            if(testMap.containsKey(x)){
                int old = (int)testMap.get(x); 
                testMap.put(x,old+1); 
            }else {
                testMap.put(x,1);
            }
        }
        out.println(testMap);
        out.println("\n_______________________________________________\n");

         


        /*
         *Sets when discussing Integers::
         * 
         *      Sets and lists are from the Collection interface
         *      LinkedHash sets do not order the what is inside the set at all
         *      Hash sets go by numerical value for ordering numbers 
         *      Tree sets go by literal value for ordering numbers,
         *      then whichever of the alphabet that comes first (A or a whichever is added first comes first)
         *      then by symbols 
         * 
         * Sets when discussing Strings:: 
         * 
         *      HashSets order by the hash code of the string
         *      LinkedHash Sets get printed in the order they were added
         *      Tree Sets order by tree data structure (smallest ascii # to largest)
         *    
         * Methods for Sets:: 
         * 
         *      .add(element) - adds element to the set at next available index
         *      .size() gets the length/ size of the set
         *      .remove(element) removes all of a specific value from your set
         *      .contains(element) returns a boolean
         *      .clear() clears a list of all items in the set
         *      .isEmpty() returns a boolean, true if the set is empty and false if the set has items in it
         * 
         * Methods for ArrayLists::
         * 
         *      .add(element) - adds element to list at next available index
         *      .get(index) - gets an element from a specific index
         *      .set(index,element) - sets a specific index to the input element
         *      .subList(startIndex, endIndex) - gets the elements between the indicies (startIndex inclusive, endIndex exclusive)
         * 
         * Maps::
         * 
         * *****You cannot have two of the same keys for a map but you can have the same element with accessed through different keys******
         *      ***When printing map.get(element) and that element doesn't exist, it prints out "null" ***
         * 
         *      HashMaps:
         *             - does not return in order, prints in order of smallest HashCode to largest
         *             - Sort of the same ordering as Hash Sets
         *             - keys and elements do not have to have the same data types
         * 
         *      TreeMaps:
         *             - prints in order of smallest ascii value to largest
         *             - keys and elements have to have the same data type
         * 
         *      LinkedHashMaps:
         *             - prints in order they are "put"
         *             - keys and elements do not have to have the same data types
         * 
         * Methods for Maps::
         * 
         *      .put(key,element) - associates a specific element with a specific key
         *      .get(key) - gets the element associated with the key
         *      .containsValue(element) - returns true or false depending on if the map contains that element
         *      .containsKey(key) - returns true or false depending on if the map contains that key
         *      .values() - returns all the values of the map
         *      .clear() - clears the map of all keys and elements
         *      .remove() - removes the element associated with the key from the map
         * 
         * Methods for Arrays(the object not the type of data)::
         *      .sort(reference,optional: startIndex,endIndex) - sorts the array, sorts the array from the specified index, exclusive
         *      
         * 
         */
    }
}

/* This class is meant to be a sort of Note taking and testing for all things java
 * 
 */
