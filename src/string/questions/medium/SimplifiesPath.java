/*

You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:

The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.


Example 1:

Input: path = "/home/"

Output: "/home"

Explanation:

The trailing slash should be removed.

Example 2:

Input: path = "/home//foo/"

Output: "/home/foo"

Explanation:

Multiple consecutive slashes are replaced by a single one.

Example 3:

Input: path = "/home/user/Documents/../Pictures"

Output: "/home/user/Pictures"

Explanation:

A double period ".." refers to the directory up a level (the parent directory).

Example 4:

Input: path = "/../"

Output: "/"

Explanation:

Going one level up from the root directory is not possible.

Example 5:

Input: path = "/.../a/../b/c/../d/./"

Output: "/.../b/d"

Explanation:

"..." is a valid name for a directory in this problem.


Constraints:

1 <= path.length <= 3000
path consists of English letters, digits, period '.', slash '/' or '_'.
path is a valid absolute Unix path.
*/
package string.questions.medium;

import java.util.Stack;

/*
IMPORTANT 
NEW LEARNED !!!
What does split() do?
It breaks a string into pieces based on a separator.

Example:
String str = "apple,banana,mango";
String[] arr = str.split(",");

Now:                                                                                                                                                                                                                                                                                                                                                                                      
arr[0] = "apple"
arr[1] = "banana"
arr[2] = "mango"

because we split wherever we found ,.
*/

class SolutionSP
{
    public String simplifyPath(String str) 
    {
        //array 
        Stack<String> stack=new Stack<>();

        // array with String datatype
        String[] parts=str.split("/");

        int l=0;

        //while loop
        while(l<parts.length)
        {
            // "" bcuz after split if a//b then it is spilted as [a,"",b]
            if(parts[l].equals("") || parts[l].equals(".") )
            // eg: "/d/./" => "/d"
            {
                //dont push in the stack
            }
            else if(parts[l].equals(".."))
            {
                //remove last String from the stack 
                // we only  storing the names rn not slashes 
                // slashes we will add when returning the answer
                // eg: "/home/user/Documents/../Pictures" => "/home/user/Pictures"
              if(!stack.isEmpty())
              {
                stack.pop();
              }
              else
              {
                //dont push anything into the stack
              }   
            }
            //else
            else
            {
            stack.push(parts[l]);
            }
            l++;
        }
        //end of while loop
 
        //StringBuilder
        StringBuilder res = new StringBuilder();
         
      
        //till stack isn't empty
       /* while(!stack.isEmpty())
        {
            if(stack.size()==1)
            {
                //if size==1 then dont add "/"
                 res.append(stack.pop());
            }
            else
            {
            res.append(stack.pop());
            res.append("/");
            }
        }
        */   // HERE WE AS STACK IS LIFO SO THE ORDER WAS INCORRECT
        // WE CAN DO FOR EACH LOOP FOR THE STACK 
        // IT DO IN FIFO ORDER ONLY** IMPORTANT
        for(String s:stack)
        {
            //iteration only we not poping anything outta the stack
             res.append("/");
            res.append(s);
           
            
        }
    
       String result= res.toString();

      if(res.length() == 0)
{
    return "/";
}

return res.toString();
    }
}
public class SimplifiesPath {
    
}
