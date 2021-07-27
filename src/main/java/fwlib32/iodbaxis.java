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
public class iodbaxis extends Structure {
	/** Axis number */
	public int axnum;
	/** Axis move distance */
	public NativeLong[] data = new NativeLong[32];
	/** Decimal point */
	public NativeLong[] dp = new NativeLong[32];
	public iodbaxis() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("axnum", "data", "dp");
	}
	public iodbaxis(int axnum, NativeLong data[], NativeLong dp[]) {
		super();
		this.axnum = axnum;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
		if ((dp.length != this.dp.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dp = dp;
	}
	public iodbaxis(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbaxis implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbaxis implements Structure.ByValue {
		
	};
}
