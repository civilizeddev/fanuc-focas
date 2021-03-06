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
public class OUT_FLNTSFERRTBL extends Structure {
	public byte SelfNode;
	public byte[] Reserved = new byte[3];
	public NativeLong EntryNode;
	public NODE_ERR[] nodeErr = new NODE_ERR[30];
	public OUT_FLNTSFERRTBL() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("SelfNode", "Reserved", "EntryNode", "nodeErr");
	}
	public OUT_FLNTSFERRTBL(byte SelfNode, byte Reserved[], NativeLong EntryNode, NODE_ERR nodeErr[]) {
		super();
		this.SelfNode = SelfNode;
		if ((Reserved.length != this.Reserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Reserved = Reserved;
		this.EntryNode = EntryNode;
		if ((nodeErr.length != this.nodeErr.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.nodeErr = nodeErr;
	}
	public OUT_FLNTSFERRTBL(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_FLNTSFERRTBL implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_FLNTSFERRTBL implements Structure.ByValue {
		
	};
}
