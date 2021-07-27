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
public class odbinf extends Structure {
	/** maximum shape number */
	public short max_shape_num;
	/** maximum tool number */
	public short max_tool_num;
	/** maximum tool holder number */
	public short max_holder_num;
	/** maximum object number */
	public short max_object_num;
	/** maximum element number */
	public short max_element_num;
	/** maximum each tool holder shape number */
	public short max_holder_shpnum;
	/** maximum each object shape number */
	public short max_object_shpnum;
	/** reserve */
	public short reserve;
	public odbinf() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("max_shape_num", "max_tool_num", "max_holder_num", "max_object_num", "max_element_num", "max_holder_shpnum", "max_object_shpnum", "reserve");
	}
	public odbinf(short max_shape_num, short max_tool_num, short max_holder_num, short max_object_num, short max_element_num, short max_holder_shpnum, short max_object_shpnum, short reserve) {
		super();
		this.max_shape_num = max_shape_num;
		this.max_tool_num = max_tool_num;
		this.max_holder_num = max_holder_num;
		this.max_object_num = max_object_num;
		this.max_element_num = max_element_num;
		this.max_holder_shpnum = max_holder_shpnum;
		this.max_object_shpnum = max_object_shpnum;
		this.reserve = reserve;
	}
	public odbinf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbinf implements Structure.ByReference {
		
	};
	public static class ByValue extends odbinf implements Structure.ByValue {
		
	};
}