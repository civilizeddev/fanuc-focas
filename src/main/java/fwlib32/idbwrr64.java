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
public class idbwrr64 extends Structure {
	/** dummy */
	public short datano;
	/** axis number */
	public short type;
	/** dummy2 */
	public short[] dummy = new short[2];
	/** preset data */
	public realdata[] data = new realdata[32];
	public idbwrr64() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("datano", "type", "dummy", "data");
	}
	public idbwrr64(short datano, short type, short dummy[], realdata data[]) {
		super();
		this.datano = datano;
		this.type = type;
		if ((dummy.length != this.dummy.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy = dummy;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public idbwrr64(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends idbwrr64 implements Structure.ByReference {
		
	};
	public static class ByValue extends idbwrr64 implements Structure.ByValue {
		
	};
}
