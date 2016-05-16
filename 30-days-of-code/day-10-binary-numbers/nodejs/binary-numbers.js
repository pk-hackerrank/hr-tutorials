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
   // var n = parseInt(readLine());
    var bin = n.toString(2); // Converting integer into binary number
    var maxLength = 0;
    var tempLength = 0;
    bin = bin.split(''); // Converting binary string into array
    // Loop for getting maximum consecutive 1's
    // Looping till bin.length + 1 - if the max consec number is at the end
    for(var i =0 ;i<bin.length+1;i++){
    	if(bin[i] === '1'){
    		tempLength+=1;
    	}else{
    		if(tempLength>maxLength){
    			maxLength = tempLength;
    		}
    		tempLength = 0;
    	}
    }
    process.stdout.write(maxLength);
}