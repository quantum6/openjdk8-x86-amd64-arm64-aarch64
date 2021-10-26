/*
 * Copyright (c) 2009, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package sun.nio.ch.sctp;

import java.net.SocketAddress;
import java.net.InetAddress;
import java.io.IOException;
import java.util.Set;
import java.nio.channels.spi.SelectorProvider;
import com.sun.nio.sctp.SctpChannel;
import com.sun.nio.sctp.SctpServerChannel;
import com.sun.nio.sctp.SctpSocketOption;

/**
 * Unimplemented.
 */
public class SctpServerChannelImpl extends SctpServerChannel
{
    private static final String message = "SCTP not supported on this platform";

    public SctpServerChannelImpl(SelectorProvider provider) {
        super(provider);
        throw new UnsupportedOperationException(message);
    }

    @Override
    public SctpChannel accept() throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public SctpServerChannel bind(SocketAddress local,
            int backlog) throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public SctpServerChannel bindAddress(InetAddress address)
         throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public SctpServerChannel unbindAddress(InetAddress address)
         throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public Set<SocketAddress> getAllLocalAddresses()
            throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public <T> T getOption(SctpSocketOption<T> name) throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public <T> SctpServerChannel setOption(SctpSocketOption<T> name,
            T value) throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public Set<SctpSocketOption<?>> supportedOptions() {
        throw new UnsupportedOperationException(message);
    }

    @Override
    protected void implConfigureBlocking(boolean block) throws IOException {
        throw new UnsupportedOperationException(message);
    }

    @Override
    public void implCloseSelectableChannel() throws IOException {
        throw new UnsupportedOperationException(message);
    }
}
