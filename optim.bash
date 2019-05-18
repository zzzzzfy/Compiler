# this script is called when the judge wants our compiler to compile a source file.
# generateCode the compiled source, i.e. asm code, directly to stdout.
# don't generateCode anything other to stdout.
# if you would like to generateCode some debug information, please go to stderr.

set -e
cd "$(dirname "$0")"
export CCHK="java -classpath ./lib/antlr-4.7.1-complete.jar:./bin Main"
# cat > ./example/test.txt   # save everything in stdin to program.txt
$CCHK
