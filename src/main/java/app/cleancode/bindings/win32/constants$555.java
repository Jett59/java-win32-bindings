// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$555 {

    static final FunctionDescriptor PFNCANSHAREFOLDERW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNCANSHAREFOLDERW$MH = RuntimeHelper.downcallHandle(
        constants$555.PFNCANSHAREFOLDERW$FUNC
    );
    static final FunctionDescriptor PFNSHOWSHAREFOLDERUIW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNSHOWSHAREFOLDERUIW$MH = RuntimeHelper.downcallHandle(
        constants$555.PFNSHOWSHAREFOLDERUIW$FUNC
    );
    static final FunctionDescriptor InitNetworkAddressControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle InitNetworkAddressControl$MH = RuntimeHelper.downcallHandle(
        "InitNetworkAddressControl",
        constants$555.InitNetworkAddressControl$FUNC
    );
    static final FunctionDescriptor SHGetDriveMedia$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetDriveMedia$MH = RuntimeHelper.downcallHandle(
        "SHGetDriveMedia",
        constants$555.SHGetDriveMedia$FUNC
    );
}


