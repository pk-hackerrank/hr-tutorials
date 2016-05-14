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
	var input = {};
    var N = parseInt(readLine());
	for(var i=0;i<N;i++){
		var temp = readLine().split(" ");
		input[temp[0]] = temp[1];
	}
	for(var j=N;j<input_stdin_array.length-1;j++){
		var givenQuery =readLine();
		if(input[givenQuery]){
			console.log(givenQuery+"="+input[givenQuery]);
		}else{
			console.log("Not found");
		}
	}
}