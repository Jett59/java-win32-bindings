// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$456 {

    static final FunctionDescriptor CertCompareIntegerBlob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCompareIntegerBlob$MH = RuntimeHelper.downcallHandle(
        "CertCompareIntegerBlob",
        constants$456.CertCompareIntegerBlob$FUNC
    );
    static final FunctionDescriptor CertCompareCertificate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCompareCertificate$MH = RuntimeHelper.downcallHandle(
        "CertCompareCertificate",
        constants$456.CertCompareCertificate$FUNC
    );
    static final FunctionDescriptor CertCompareCertificateName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCompareCertificateName$MH = RuntimeHelper.downcallHandle(
        "CertCompareCertificateName",
        constants$456.CertCompareCertificateName$FUNC
    );
    static final FunctionDescriptor CertIsRDNAttrsInCertificateName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertIsRDNAttrsInCertificateName$MH = RuntimeHelper.downcallHandle(
        "CertIsRDNAttrsInCertificateName",
        constants$456.CertIsRDNAttrsInCertificateName$FUNC
    );
    static final FunctionDescriptor CertComparePublicKeyInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertComparePublicKeyInfo$MH = RuntimeHelper.downcallHandle(
        "CertComparePublicKeyInfo",
        constants$456.CertComparePublicKeyInfo$FUNC
    );
    static final FunctionDescriptor CertGetPublicKeyLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetPublicKeyLength$MH = RuntimeHelper.downcallHandle(
        "CertGetPublicKeyLength",
        constants$456.CertGetPublicKeyLength$FUNC
    );
}

