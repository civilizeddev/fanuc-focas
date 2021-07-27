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
public class odb3dchk extends Structure {
	public NativeLong pathno;
	public fwlib32.odbsysex.path_struct[] path = new fwlib32.odbsysex.path_struct[10];
	public static class path_struct extends Structure {
		public NativeLong mode;
		public prginf prginf;
		public NativeLong[] dummy = new NativeLong[2];
		public NativeLong[] mcode = new NativeLong[2];
		public toolinf tlinf;
		public NativeLong[] dummy2 = new NativeLong[3];
		public NativeLong ctrlaxis;
		public posinf[] data = new posinf[32];
		public path_struct() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("mode", "prginf", "dummy", "mcode", "tlinf", "dummy2", "ctrlaxis", "data");
		}
		public path_struct(NativeLong mode, prginf prginf, NativeLong dummy[], NativeLong mcode[], toolinf tlinf, NativeLong dummy2[], NativeLong ctrlaxis, posinf data[]) {
			super();
			this.mode = mode;
			this.prginf = prginf;
			if ((dummy.length != this.dummy.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.dummy = dummy;
			if ((mcode.length != this.mcode.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.mcode = mcode;
			this.tlinf = tlinf;
			if ((dummy2.length != this.dummy2.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.dummy2 = dummy2;
			this.ctrlaxis = ctrlaxis;
			if ((data.length != this.data.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.data = data;
		}
		public path_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends path_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends path_struct implements Structure.ByValue {
			
		};
	};
	public odb3dchk() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pathno", "path");
	}
	public odb3dchk(NativeLong pathno, fwlib32.odbsysex.path_struct path[]) {
		super();
		this.pathno = pathno;
		if ((path.length != this.path.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.path = path;
	}
	public odb3dchk(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odb3dchk implements Structure.ByReference {
		
	};
	public static class ByValue extends odb3dchk implements Structure.ByValue {
		
	};
}
