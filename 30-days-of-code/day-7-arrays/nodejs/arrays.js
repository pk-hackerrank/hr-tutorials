// Code for reading data from command line input and processing it
// Start
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', cacheInput).on('end', processData);

function cacheInput(data) {
    input_stdin += data;
}

function processData() {
    input_stdin_array = input_stdin.split("\n");
    main();    
}

function readLine() {
    return input_stdin_array[input_currentline++];
}
// End

// main method
function main() {
    var n = parseInt(readLine());
    arr = readLine().split(' ');
    // Converting array of integers in string format to number format
    arr = arr.map(Number); // Not required to convert to numbers, just checking the conversion works or not
    for(index = arr.length -1; index>=0;--index){
        process.stdout.write(arr[index]+ " ")
    }
}
