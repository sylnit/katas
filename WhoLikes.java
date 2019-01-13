class whoLikes {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        String output = "";
        if(names.length == 0){
          output = "no one likes this";
        }else if(names.length == 1){
          output = names[0]+" likes this";
        }
        else if(names.length == 2){
          output = names[0]+" and "+names[1]+" like this";
        }
        else if(names.length == 3){
          output = names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        if(names.length >= 4){
          output = names[0]+", "+names[1]+" and "+(names.length-2)+" others like this";
        }
        return output;
    }
}
