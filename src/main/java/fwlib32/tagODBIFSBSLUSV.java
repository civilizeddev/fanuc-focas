package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagODBIFSBSLUSV extends Structure {
	/** Slave Number */
	public short slave_num;
	/** Axis Number */
	public short axis_num;
	/** Axis Name */
	public byte[] axis_name = new byte[4];
	public byte tndm;
	public byte[] reserve = new byte[3];
	public tagODBIFSBSLUSV() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slave_num", "axis_num", "axis_name", "tndm", "reserve");
	}
	public tagODBIFSBSLUSV(short slave_num, short axis_num, byte axis_name[], byte tndm, byte reserve[]) {
		super();
		this.slave_num = slave_num;
		this.axis_num = axis_num;
		if ((axis_name.length != this.axis_name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.axis_name = axis_name;
		this.tndm = tndm;
		if ((reserve.length != this.reserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve = reserve;
	}
	public tagODBIFSBSLUSV(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBIFSBSLUSV implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBIFSBSLUSV implements Structure.ByValue {
		
	};
}
