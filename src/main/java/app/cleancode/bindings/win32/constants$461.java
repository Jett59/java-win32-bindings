// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$461 {

    static final FunctionDescriptor CryptInstallDefaultContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptInstallDefaultContext$MH = RuntimeHelper.downcallHandle(
        "CryptInstallDefaultContext",
        constants$461.CryptInstallDefaultContext$FUNC
    );
    static final FunctionDescriptor CryptUninstallDefaultContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUninstallDefaultContext$MH = RuntimeHelper.downcallHandle(
        "CryptUninstallDefaultContext",
        constants$461.CryptUninstallDefaultContext$FUNC
    );
    static final FunctionDescriptor CryptExportPublicKeyInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptExportPublicKeyInfo$MH = RuntimeHelper.downcallHandle(
        "CryptExportPublicKeyInfo",
        constants$461.CryptExportPublicKeyInfo$FUNC
    );
    static final FunctionDescriptor CryptExportPublicKeyInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptExportPublicKeyInfoEx$MH = RuntimeHelper.downcallHandle(
        "CryptExportPublicKeyInfoEx",
        constants$461.CryptExportPublicKeyInfoEx$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$461.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC$FUNC
    );
}


