// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$443 {

    static final FunctionDescriptor CertVerifySubjectCertificateContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertVerifySubjectCertificateContext$MH = RuntimeHelper.downcallHandle(
        "CertVerifySubjectCertificateContext",
        constants$443.CertVerifySubjectCertificateContext$FUNC
    );
    static final FunctionDescriptor CertDuplicateCertificateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateCertificateContext$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateCertificateContext",
        constants$443.CertDuplicateCertificateContext$FUNC
    );
    static final FunctionDescriptor CertCreateCertificateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCreateCertificateContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateCertificateContext",
        constants$443.CertCreateCertificateContext$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateContext",
        constants$443.CertFreeCertificateContext$FUNC
    );
    static final FunctionDescriptor CertSetCertificateContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetCertificateContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertSetCertificateContextProperty",
        constants$443.CertSetCertificateContextProperty$FUNC
    );
    static final FunctionDescriptor CertGetCertificateContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCertificateContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertGetCertificateContextProperty",
        constants$443.CertGetCertificateContextProperty$FUNC
    );
}


