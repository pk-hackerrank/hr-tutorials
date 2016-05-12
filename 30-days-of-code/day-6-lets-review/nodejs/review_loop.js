process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', cacheInput).on('end',processData);

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

function main() {
	// Reading noOfTestCases as integer value
    var noOfTestCases = parseInt(readLine());
    // Looping through till the test cases are passed
    for(var i=1; i<=noOfTestCases;i++){
    	// Reading input string
        var input = readLine();
        // Initializing evenIndexesVals and oddIndexesVals
        var evenIndexesVals = [];
        var oddIndexesVals = [];
        // Splitting values into array 
        var inputInArray = input.split("");
        for(var j=0;j<inputInArray.length;j++){
        	// Checking the index is even or not
        	if(j%2 === 0 ){
        		// Pushing the even indexed element 
        		evenIndexesVals.push(inputInArray[j]);
        	}else{
        		// Pushing the odd indexed element 
        		oddIndexesVals.push(inputInArray[j]);
        	}
        }
        // Printing the evenIndexesVals and oddIndexesVals by join
        console.log(evenIndexesVals.join("") + " " + oddIndexesVals.join(""));
    }
}