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
public class OUT_ETHTYPE extends Structure {
	public short Kind;
	public short FunctionEmb;
	public short FunctionBoard;
	public short FunctionEmbCe;
	public OUT_ETHTYPE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Kind", "FunctionEmb", "FunctionBoard", "FunctionEmbCe");
	}
	public OUT_ETHTYPE(short Kind, short FunctionEmb, short FunctionBoard, short FunctionEmbCe) {
		super();
		this.Kind = Kind;
		this.FunctionEmb = FunctionEmb;
		this.FunctionBoard = FunctionBoard;
		this.FunctionEmbCe = FunctionEmbCe;
	}
	public OUT_ETHTYPE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_ETHTYPE implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_ETHTYPE implements Structure.ByValue {
		
	};
}
