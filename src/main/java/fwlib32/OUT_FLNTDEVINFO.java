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
public class OUT_FLNTDEVINFO extends Structure {
	public short Kind;
	public short dummy;
	public NativeLong FunctionFLnetBoard;
	public NativeLong FunctionFLnetEmb;
	public NativeLong FunctionFLnetCard;
	public OUT_FLNTDEVINFO() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Kind", "dummy", "FunctionFLnetBoard", "FunctionFLnetEmb", "FunctionFLnetCard");
	}
	public OUT_FLNTDEVINFO(short Kind, short dummy, NativeLong FunctionFLnetBoard, NativeLong FunctionFLnetEmb, NativeLong FunctionFLnetCard) {
		super();
		this.Kind = Kind;
		this.dummy = dummy;
		this.FunctionFLnetBoard = FunctionFLnetBoard;
		this.FunctionFLnetEmb = FunctionFLnetEmb;
		this.FunctionFLnetCard = FunctionFLnetCard;
	}
	public OUT_FLNTDEVINFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_FLNTDEVINFO implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_FLNTDEVINFO implements Structure.ByValue {
		
	};
}
