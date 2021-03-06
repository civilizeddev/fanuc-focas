package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IODBETP extends Structure {
	public short ParameterType;
	public prm_union prm;
	public static class prm_union extends Union {
		public TCPPRM tcp;
		public HOSTPRM host;
		public FTPPRM ftp;
		public ETBPRM etb;
		public prm_union() {
			super();
		}
		public prm_union(TCPPRM tcp) {
			super();
			this.tcp = tcp;
			setType(TCPPRM.class);
		}
		public prm_union(HOSTPRM host) {
			super();
			this.host = host;
			setType(HOSTPRM.class);
		}
		public prm_union(FTPPRM ftp) {
			super();
			this.ftp = ftp;
			setType(FTPPRM.class);
		}
		public prm_union(ETBPRM etb) {
			super();
			this.etb = etb;
			setType(ETBPRM.class);
		}
		public prm_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends prm_union implements Structure.ByReference {
			
		};
		public static class ByValue extends prm_union implements Structure.ByValue {
			
		};
	};
	public IODBETP() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ParameterType", "prm");
	}
	public IODBETP(short ParameterType, prm_union prm) {
		super();
		this.ParameterType = ParameterType;
		this.prm = prm;
	}
	public IODBETP(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IODBETP implements Structure.ByReference {
		
	};
	public static class ByValue extends IODBETP implements Structure.ByValue {
		
	};
}
