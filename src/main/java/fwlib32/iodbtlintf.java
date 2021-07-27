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
public class iodbtlintf extends Structure {
	public short[] inf_tool = new short[2];
	public iodbtlintf() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("inf_tool");
	}
	public iodbtlintf(short inf_tool[]) {
		super();
		if ((inf_tool.length != this.inf_tool.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.inf_tool = inf_tool;
	}
	public iodbtlintf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbtlintf implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbtlintf implements Structure.ByValue {
		
	};
}
