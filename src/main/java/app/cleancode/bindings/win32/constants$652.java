// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$652 {

    static final FunctionDescriptor SCardReleaseStartedEvent$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle SCardReleaseStartedEvent$MH = RuntimeHelper.downcallHandle(
        "SCardReleaseStartedEvent",
        constants$652.SCardReleaseStartedEvent$FUNC
    );
    static final FunctionDescriptor SCardLocateCardsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsA$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsA",
        constants$652.SCardLocateCardsA$FUNC
    );
    static final FunctionDescriptor SCardLocateCardsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsW$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsW",
        constants$652.SCardLocateCardsW$FUNC
    );
    static final FunctionDescriptor SCardLocateCardsByATRA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsByATRA$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRA",
        constants$652.SCardLocateCardsByATRA$FUNC
    );
    static final FunctionDescriptor SCardLocateCardsByATRW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsByATRW$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRW",
        constants$652.SCardLocateCardsByATRW$FUNC
    );
    static final FunctionDescriptor SCardGetStatusChangeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardGetStatusChangeA$MH = RuntimeHelper.downcallHandle(
        "SCardGetStatusChangeA",
        constants$652.SCardGetStatusChangeA$FUNC
    );
}


