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
public class odbcub extends Structure {
	/** reference vertex */
	public NativeLong[] ref_vtx = new NativeLong[3];
	/** adjacence vertex1 */
	public NativeLong[] adj_vtx1 = new NativeLong[3];
	/** adjacence vertex2 */
	public NativeLong[] adj_vtx2 = new NativeLong[3];
	/** adjacence vertex3 */
	public NativeLong[] adj_vtx3 = new NativeLong[3];
	/** numetrical unit */
	public byte n_unit;
	/** cube form flag */
	public byte cb_form;
	public odbcub() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ref_vtx", "adj_vtx1", "adj_vtx2", "adj_vtx3", "n_unit", "cb_form");
	}
	public odbcub(NativeLong ref_vtx[], NativeLong adj_vtx1[], NativeLong adj_vtx2[], NativeLong adj_vtx3[], byte n_unit, byte cb_form) {
		super();
		if ((ref_vtx.length != this.ref_vtx.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ref_vtx = ref_vtx;
		if ((adj_vtx1.length != this.adj_vtx1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.adj_vtx1 = adj_vtx1;
		if ((adj_vtx2.length != this.adj_vtx2.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.adj_vtx2 = adj_vtx2;
		if ((adj_vtx3.length != this.adj_vtx3.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.adj_vtx3 = adj_vtx3;
		this.n_unit = n_unit;
		this.cb_form = cb_form;
	}
	public odbcub(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbcub implements Structure.ByReference {
		
	};
	public static class ByValue extends odbcub implements Structure.ByValue {
		
	};
}
