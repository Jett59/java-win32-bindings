// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$446 {

    static final FunctionDescriptor CertFindCertificateInCRL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFindCertificateInCRL$MH = RuntimeHelper.downcallHandle(
        "CertFindCertificateInCRL",
        constants$446.CertFindCertificateInCRL$FUNC
    );
    static final FunctionDescriptor CertIsValidCRLForCertificate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertIsValidCRLForCertificate$MH = RuntimeHelper.downcallHandle(
        "CertIsValidCRLForCertificate",
        constants$446.CertIsValidCRLForCertificate$FUNC
    );
    static final FunctionDescriptor CertAddEncodedCertificateToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddEncodedCertificateToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddEncodedCertificateToStore",
        constants$446.CertAddEncodedCertificateToStore$FUNC
    );
    static final FunctionDescriptor CertAddCertificateContextToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddCertificateContextToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddCertificateContextToStore",
        constants$446.CertAddCertificateContextToStore$FUNC
    );
    static final FunctionDescriptor CertAddSerializedElementToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddSerializedElementToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddSerializedElementToStore",
        constants$446.CertAddSerializedElementToStore$FUNC
    );
    static final FunctionDescriptor CertDeleteCertificateFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDeleteCertificateFromStore$MH = RuntimeHelper.downcallHandle(
        "CertDeleteCertificateFromStore",
        constants$446.CertDeleteCertificateFromStore$FUNC
    );
}


