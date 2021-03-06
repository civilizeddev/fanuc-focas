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
public class OUT_DNMHIST extends Structure {
	public short Count;
	public short reserved;
	public OUT_DNMHIST_LOG[] Log = new OUT_DNMHIST_LOG[32];
	public OUT_DNMHIST() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Count", "reserved", "Log");
	}
	public OUT_DNMHIST(short Count, short reserved, OUT_DNMHIST_LOG Log[]) {
		super();
		this.Count = Count;
		this.reserved = reserved;
		if ((Log.length != this.Log.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Log = Log;
	}
	public OUT_DNMHIST(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_DNMHIST implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_DNMHIST implements Structure.ByValue {
		
	};
}
