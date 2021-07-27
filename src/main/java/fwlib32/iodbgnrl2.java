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
public class iodbgnrl2 extends Structure {
	/** dummy */
	public short datano;
	/** data select flag */
	public short type;
	/** general signal */
	public short sgnal;
	public iodbgnrl2() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("datano", "type", "sgnal");
	}
	public iodbgnrl2(short datano, short type, short sgnal) {
		super();
		this.datano = datano;
		this.type = type;
		this.sgnal = sgnal;
	}
	public iodbgnrl2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbgnrl2 implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbgnrl2 implements Structure.ByValue {
		
	};
}
