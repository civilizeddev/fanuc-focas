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
public class FTPTRANS_PRM extends Structure {
	public FTP_CLIENT_PRM[] opposite = new FTP_CLIENT_PRM[3];
	public FTPTRANS_PRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("opposite");
	}
	public FTPTRANS_PRM(FTP_CLIENT_PRM opposite[]) {
		super();
		if ((opposite.length != this.opposite.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.opposite = opposite;
	}
	public FTPTRANS_PRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTPTRANS_PRM implements Structure.ByReference {
		
	};
	public static class ByValue extends FTPTRANS_PRM implements Structure.ByValue {
		
	};
}
