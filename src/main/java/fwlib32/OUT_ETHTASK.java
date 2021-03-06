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
public class OUT_ETHTASK extends Structure {
	public short Type;
	public short Count;
	public byte[] pad = new byte[12];
	public TSK_STS[] task = new TSK_STS[32];
	public OUT_ETHTASK() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Type", "Count", "pad", "task");
	}
	public OUT_ETHTASK(short Type, short Count, byte pad[], TSK_STS task[]) {
		super();
		this.Type = Type;
		this.Count = Count;
		if ((pad.length != this.pad.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad = pad;
		if ((task.length != this.task.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.task = task;
	}
	public OUT_ETHTASK(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_ETHTASK implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_ETHTASK implements Structure.ByValue {
		
	};
}
