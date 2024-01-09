var sen =  "hello this is sundhar_raj from batch-3";

console.log(longestWord(sen));;

function longestWord(string) {

    var str = string.split(" ");
    var longest = 0;
    var word = null;
    for (var i = 0; i < str.length - 1; i++) {
        if (longest < str[i].length) {
            longest = str[i].length;
            word = str[i];
        }
    }
    return word;
}