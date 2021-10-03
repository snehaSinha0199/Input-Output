package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Byte Streams
 * when you want to process files like (.jpg.class) then we should go for Byte Stream.
 * In other words the files which human can't read use Byte Streams.
 * 
 * Important classes during from the Input Stream and Output Streams:-
 * 1.PipedInputStream,PipedOutputStream these two classes create a communicatio chanel 
 * on which data can be sent and recieved.PipedOutStream sends the data and PipedOutStream 
 * recieves the data sent on the channel.
 * 
 * 2.FileInputStream,FileOutputStream.FileInputStream recieves a byte Streams from a file,
 * FileOutputStream writes a byte stream into a file.
 * 
 * 3.FilteredInputStream,FilteredOutputStreams these FilteredStreams are used to       functionalities
 * to plain streams.the output of an InputStreams can be filtered using FilteredOutputStream.
 * The output of an OutputStream can be filtered using FilteredOutputStream.
 * 
 * 4.BufferedInputStream,BufferedOutputStream these classes and buffering capabilities to an
 * input stream and to an output stream respectively.
 * 
 * 5.PushBackInputStream A sub class of FilterinputStream,it adds push back functionalities to an
 * input stream.
 * 
 * 6.DataInputStream,DataOutputStream-DataInputStream can be used to read java primitive data types
 * from an input stream.DataOutputStream can be used to write java primitives data types to an output
 * stream. 
 */
public class ByteStreamDemo {
	
}
