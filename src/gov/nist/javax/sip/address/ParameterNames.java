package gov.nist.javax.sip.address;

/**
 * Common parameter names.
 *
 * @version JAIN-SIP-1.1 $Revision: 1.3 $ $Date: 2004-10-28 19:02:49 $
 *
 * @author M. Ranganathan <mranga@nist.gov>  <br/>
 *
 *<a href="{@docRoot}/uncopyright.html">This code is in the public domain.</a>
 */
public interface ParameterNames {
	public static final String SIP_URI_SCHEME = "sip";
	public static final String SIPS_URI_SCHEME = "sips";
	public static final String TEL_URI_SCHEME = "tel";
	public static final String POSTDIAL = "postdial";
	public static final String PHONE_CONTEXT_TAG = "context-tag";
	public static final String ISUB = "isub";
	public static final String PROVIDER_TAG = "provider-tag";
	public static final String UDP = GenericURI.UDP;
	public static final String TCP = GenericURI.TCP;
	public static final String TLS = GenericURI.TLS;
}
/*
 * $Log: not supported by cvs2svn $
 * Revision 1.2  2004/01/22 13:26:28  sverker
 * Issue number:
 * Obtained from:
 * Submitted by:  sverker
 * Reviewed by:   mranga
 *
 * Major reformat of code to conform with style guide. Resolved compiler and javadoc warnings. Added CVS tags.
 *
 * CVS: ----------------------------------------------------------------------
 * CVS: Issue number:
 * CVS:   If this change addresses one or more issues,
 * CVS:   then enter the issue number(s) here.
 * CVS: Obtained from:
 * CVS:   If this change has been taken from another system,
 * CVS:   then name the system in this line, otherwise delete it.
 * CVS: Submitted by:
 * CVS:   If this code has been contributed to the project by someone else; i.e.,
 * CVS:   they sent us a patch or a set of diffs, then include their name/email
 * CVS:   address here. If this is your work then delete this line.
 * CVS: Reviewed by:
 * CVS:   If we are doing pre-commit code reviews and someone else has
 * CVS:   reviewed your changes, include their name(s) here.
 * CVS:   If you have not had it reviewed then delete this line.
 *
 */
