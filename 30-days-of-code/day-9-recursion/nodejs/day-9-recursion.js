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

function main(){
    var N = parseInt(readLine());
	console.log(factorial(N));
}
function factorial(n){
	if(n<=1){
		return 1;
	}else{
		return n*factorial(n-1);
	}
}