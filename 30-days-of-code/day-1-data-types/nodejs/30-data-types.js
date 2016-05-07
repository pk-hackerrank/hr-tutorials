// Start
// Setup of reading input from command line
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

// On stdin data event adding it to input_stdin
process.stdin.on('data', function (data) {
    input_stdin += data;
});

// On stdin end event splitting input_stdin by new line chars 
process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    // Calling main method to process the input
    main();    
});

// Reads complete line from STDIN
function readLine() {
    return input_stdin_array[input_currentline++];
}

// End
function main() {
    var i = 4
    var d = 4.0
    var s = "HackerRank "
    // Reading next Line from input and parsing to integer value
    var i1 = parseInt(readLine());
    // Reading next Line from input and parsing to float value
    var d1 = parseFloat(readLine());
    // Reading next Line
    var s1 = readLine();
    // Printing integer sum
    console.log(i+i1);
    // Printing float sum 
    console.log(d+d1);
    // Printing String concatinated value
    console.log(s+s1);
}