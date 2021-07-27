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
public class FL_DEVTYPE extends Structure {
	public short Kind1;
	public byte[] pad1 = new byte[2];
	public NativeLong FunctionFLnet1;
	public short Kind2;
	public byte[] pad2 = new byte[2];
	public NativeLong FunctionFLnet2;
	public FL_DEVTYPE() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Kind1", "pad1", "FunctionFLnet1", "Kind2", "pad2", "FunctionFLnet2");
	}
	public FL_DEVTYPE(short Kind1, byte pad1[], NativeLong FunctionFLnet1, short Kind2, byte pad2[], NativeLong FunctionFLnet2) {
		super();
		this.Kind1 = Kind1;
		if ((pad1.length != this.pad1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad1 = pad1;
		this.FunctionFLnet1 = FunctionFLnet1;
		this.Kind2 = Kind2;
		if ((pad2.length != this.pad2.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad2 = pad2;
		this.FunctionFLnet2 = FunctionFLnet2;
	}
	public FL_DEVTYPE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FL_DEVTYPE implements Structure.ByReference {
		
	};
	public static class ByValue extends FL_DEVTYPE implements Structure.ByValue {
		
	};
}
