package io;
/**
 *Stream:-It is a sequence of data.
 *In java we deal with input and output in terms of streams.
 *ex.When you read a sequence of bytes to a binary file,
 *you are writing to an output stream.
 *Q1.Difference b/w character stream and binary stream?
 *ans:-Character streams(text files) are human readable files containing text(characters).
 *Binary files are machine readable or low level data storage which human can't read it.
 *
 * Important classes driving from the Reader class
 * 1.StringReader=a character stream that operates on a string.
 * 2.InputStreamReader=this class is a bridge b/w CharacterStreams and ByteStreams.
 * 3.FileReader=derived class of InputStreamReader that provide support for reading character files.
 * 4.PipeReader=the PipedReader and PipeWriter  classes from a pair for piped  reading/writing of
 *  characters.
 * 5.FilterReader=abstract base class for streams that supports a filtering operation applied on 
 * data as character are read from the streams.
 * 6.PushBackReader=derived class of FilterReader that allows read characters to be pushed back 
 * into the streams.
 * 7.BufferedReader=this class adds buffering to the underlying character stream so that there
 * is no need to excess the underlying files system for each read and write operation.
 * 
 * 
 *
 *
 */
public class StreamDemo {

}
