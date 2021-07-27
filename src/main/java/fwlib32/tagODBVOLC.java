package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagODBVOLC extends Structure {
	public NativeLong start_no;
	public NativeLong start_ax;
	public NativeLong end_no;
	public NativeLong end_ax;
	public NativeLong num;
	public byte type;
	public NativeLong[] data = new NativeLong[72];
	public tagODBVOLC() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("start_no", "start_ax", "end_no", "end_ax", "num", "type", "data");
	}
	public tagODBVOLC(NativeLong start_no, NativeLong start_ax, NativeLong end_no, NativeLong end_ax, NativeLong num, byte type, NativeLong data[]) {
		super();
		this.start_no = start_no;
		this.start_ax = start_ax;
		this.end_no = end_no;
		this.end_ax = end_ax;
		this.num = num;
		this.type = type;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public tagODBVOLC(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBVOLC implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBVOLC implements Structure.ByValue {
		
	};
}