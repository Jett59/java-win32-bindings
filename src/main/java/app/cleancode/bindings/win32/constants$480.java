// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$480 {

    static final FunctionDescriptor CertRetrieveLogoOrBiometricInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRetrieveLogoOrBiometricInfo$MH = RuntimeHelper.downcallHandle(
        "CertRetrieveLogoOrBiometricInfo",
        constants$480.CertRetrieveLogoOrBiometricInfo$FUNC
    );
    static final FunctionDescriptor CertSelectCertificateChains$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSelectCertificateChains$MH = RuntimeHelper.downcallHandle(
        "CertSelectCertificateChains",
        constants$480.CertSelectCertificateChains$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateChainList$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateChainList$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChainList",
        constants$480.CertFreeCertificateChainList$FUNC
    );
    static final FunctionDescriptor CryptRetrieveTimeStamp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptRetrieveTimeStamp$MH = RuntimeHelper.downcallHandle(
        "CryptRetrieveTimeStamp",
        constants$480.CryptRetrieveTimeStamp$FUNC
    );
    static final FunctionDescriptor CryptVerifyTimeStampSignature$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptVerifyTimeStampSignature$MH = RuntimeHelper.downcallHandle(
        "CryptVerifyTimeStampSignature",
        constants$480.CryptVerifyTimeStampSignature$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FLUSH$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
}


