/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for host.exists
 *
 * @author Suguru Yajima on 2014/05/02.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostExistRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostExistRequest() {
        setMethod("host.exists");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<Integer> hostid;
        private List<String> host;
        private List<String> name;
        private String node;
        private List<Integer> nodeids;

        public Params() {
        }

        public void addHostId(int id) {
            hostid = ZbxListUtils.add(hostid, id);
        }

        public void addHost(String host) {
            this.host = ZbxListUtils.add(this.host, host);
        }

        public void addName(String name) {
            this.name = ZbxListUtils.add(this.name, name);
        }

        public void addNodeId(int nodeId) {
            nodeids = ZbxListUtils.add(nodeids, nodeId);
        }
    }
}
