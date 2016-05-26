process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', readInput).on('end', processData);

function readInput(data) {
    input_stdin += data;
}

function processData() {
    input_stdin_array = input_stdin.split("\n");
    main();    
}

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var n = parseInt(readLine());
    a = readLine().split(' ');
    a = a.map(Number);
    var totalNoOfSwaps = 0;
    for (var i = 0; i < a.length; i++) {
        var numberOfSwaps = 0;
        
        for (var j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
            	var x = a[j];
            	a[j] = a[j + 1];
            	a[j + 1] = x;
                numberOfSwaps++;
            }
        }
        
        if (numberOfSwaps == 0) {
            break;
        }else{
        	totalNoOfSwaps += numberOfSwaps;
        }
    }
    console.log("Array is sorted in " + totalNoOfSwaps +" swaps.");
    console.log("First Element: "+ a[0]);
    console.log("Last Element: "+ a[a.length -1]);
}
