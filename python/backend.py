#!/usr/bin/python

import bottle


@bottle.route('/hello')
def hello():
    return "Hello World!"

@bottle.route('/echo')
def echo():
    return bottle.request.query.input

@bottle.route('/spoofer')
def spoofer():
    payloadSize = bottle.request.query.payload
    delay = bottle.request.query.delay
    return payloadSize + delay

def main():
    bottle.run(host='localhost', port=8080, debug=True)

if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        sys.exit(1)
